
# API for Small Twitter  

## ReadMe First
* The intention of this project is to create a social media platform
scaled to accomodate a large flow of active users.

## Tweet
* Send Tweet POST: tweets/user:id/
* Read_Twitter:  GET tweets/user:id/
* Edit_Twitter: PUT user:id/
* Delete_Twitter: DELETE: tweets/tweet_id

## Response
* Like: POST  response/like/user:id/tweet_id 
* Cancel Like: DELETE response/user:id/ tweet_id

## User
* Create_User: POST user/register
* Follow: POST user/user:id/followed_user_id 
* Unfollow: DELETE user/user:id/followed_user_id 
