# Lendo Assesment

## Solution Overview


## Getting Started

- Use `mvn clean install` in the project root directory to build the project. 
- Run the main class, `LendoAssessmentApplication` to start the application.

## Endpoints

- `/login` -> Public end-point which returns a signed JWT(OAuth2) for valid user credentials 

```
curl --location --request POST 'http://localhost:8080/login' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'username=user123' \
--data-urlencode 'password=1234' 
```


- `/blog/users` -> A protected end-point which returns a list of all users

```
curl --location --request GET 'http://localhost:8080/blog/users' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMTIzIiwibmJmIjoxNjU1NTQ2ODQ3LCJleHAiOjE2NTU2MzMyNDcsInVzZXJJZCI6IjEiLCJhdXRob3JpdGllcyI6IlVTRVIiLCJ1c2VybmFtZSI6InVzZXIxMjMifQ.LM1Y1pw4iN6sxb-diGuVCEQc7qUHWHdAVGUAHzeo5PbcqrXJcg6gp6zZ1x4z17iswo2cXMpusKuljzQUyYkt2TADRpLz6q1av5G1pKqt6QsoH3-uJyUMVWJsG7bMC8jABBKjLo7Zc2DZG8sU5t882-st8AOfpMaMU9H2gHXpyUv7FtwEenwNwv9YkJvnD_8G1aAbOtiRkMv-V8RGHBlO2nuLSidfnUNv7wC04ocgQkQcVNG1D3ygLpfa-_-_P6wVaDcAO15OaXuTx-nF3CTGn4vMkYcwhVZIUle6Ovr1qEF9Om91SzkSP6cBF_JHZ6sUYypAIbIgNJ4KHSGt6qSHBQ' 
```

- `/blog/posts` -> A protected end-point which returns a list of all posts

```
curl --location --request GET 'http://localhost:8080/blog/posts' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMTIzIiwibmJmIjoxNjU1NTQ2ODQ3LCJleHAiOjE2NTU2MzMyNDcsInVzZXJJZCI6IjEiLCJhdXRob3JpdGllcyI6IlVTRVIiLCJ1c2VybmFtZSI6InVzZXIxMjMifQ.LM1Y1pw4iN6sxb-diGuVCEQc7qUHWHdAVGUAHzeo5PbcqrXJcg6gp6zZ1x4z17iswo2cXMpusKuljzQUyYkt2TADRpLz6q1av5G1pKqt6QsoH3-uJyUMVWJsG7bMC8jABBKjLo7Zc2DZG8sU5t882-st8AOfpMaMU9H2gHXpyUv7FtwEenwNwv9YkJvnD_8G1aAbOtiRkMv-V8RGHBlO2nuLSidfnUNv7wC04ocgQkQcVNG1D3ygLpfa-_-_P6wVaDcAO15OaXuTx-nF3CTGn4vMkYcwhVZIUle6Ovr1qEF9Om91SzkSP6cBF_JHZ6sUYypAIbIgNJ4KHSGt6qSHBQ' 
```
- `/blog/comments` -> A protected end-point which returns a list of all comments

```
curl --location --request GET 'http://localhost:8080/blog/comments' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMTIzIiwibmJmIjoxNjU1NTQ2ODQ3LCJleHAiOjE2NTU2MzMyNDcsInVzZXJJZCI6IjEiLCJhdXRob3JpdGllcyI6IlVTRVIiLCJ1c2VybmFtZSI6InVzZXIxMjMifQ.LM1Y1pw4iN6sxb-diGuVCEQc7qUHWHdAVGUAHzeo5PbcqrXJcg6gp6zZ1x4z17iswo2cXMpusKuljzQUyYkt2TADRpLz6q1av5G1pKqt6QsoH3-uJyUMVWJsG7bMC8jABBKjLo7Zc2DZG8sU5t882-st8AOfpMaMU9H2gHXpyUv7FtwEenwNwv9YkJvnD_8G1aAbOtiRkMv-V8RGHBlO2nuLSidfnUNv7wC04ocgQkQcVNG1D3ygLpfa-_-_P6wVaDcAO15OaXuTx-nF3CTGn4vMkYcwhVZIUle6Ovr1qEF9Om91SzkSP6cBF_JHZ6sUYypAIbIgNJ4KHSGt6qSHBQ' 
```