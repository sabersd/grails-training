package com.opi

import grails.transaction.Transactional
import grails.plugin.cache.CacheEvict
import grails.plugin.cache.Cacheable
import grails.plugin.cache.CachePut


@Transactional
class QuestionService {
	@Cacheable('question')
	def getQuestion(String questionId) {
		println "fetching question"
		def question = Question.get(questionId)
		return question
	}

	@CachePut(value = 'question', key = '#question.id')
	void save(Question question) {
		println "Saving question $question"
		question.save()
	}

	@CacheEvict(value = 'question', key = '#question.id')
	void delete(Question question) {
		println "Deleting question $question"
		question.delete()
	}
}


