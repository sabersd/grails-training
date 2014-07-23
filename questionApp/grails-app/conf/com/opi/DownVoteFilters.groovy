package com.opi

class DownVoteFilters {

	def filters = {
		downVoter(controller: 'vote', action: 'voteDownQuestion') {
			after = { Map model ->
				flash.message = "your a down voter"
			}
		}
	}
}
