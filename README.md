# messaging-api
Messaging api to practice implementing REST with JAX-RS

Messages

Operation	URI	Method	Success / Failure	Status code
Get message	/messages/{messageId}	GET	Success	200
Not found	404
Failure	500
Delete message	/messages/{messageId}	DELETE	Success	200 or 204
Not found	404
Failure	500
Edit message	/messages/{messageId}	PUT	Success	200
Wrong format / data	400 or 415
Not found	404
Failure	500
Create message	/messages	POST	Success	201
Wrong format / data	400 or 415
Failure	500
Profiles

Operation	URI	Method	Success / Failure	Status code
Get profile	/profiles/{profileName}	GET	Success	200
Not found	404
Failure	500
Delete profile	/profiles/{profileName}	DELETE	Success	200 or 204
Not found	404
Failure	500
Edit profile	/profiles/{profileName}	PUT	Success	200
Wrong format / data	400 or 415
Not found	404
Failure	500
Create profile	/profiles	POST	Success	201
Wrong format / data	400 or 415
Failure	500
Comments (and similarly Likes and Shares)

Operation	URI	Method	Success / Failure	Status code
Get comment	/messages/{messageId}/comments/{commentId}	GET	Success	200
Not found	404
Failure	500
Delete comment	/messages/{messageId}/comments/{commentId}	DELETE	Success	200 or 204
Not found	404
Failure	500
Edit comment	/messages/{messageId}/comments/{commentId}	PUT	Success	200
Wrong format / data	400 or 415
Not found	404
Failure	500
Create comment	/messages/{messageId}/comments	POST	Success	201
Wrong format / data	400 or 415
Failure	500
