# monstarlabPH
Monstarlab Philippines Code Challenge


## Port: 9090
## Local URL: http://localhost:9090/api/v1/movies
## API Key: qwer123

### API endpoints:
GET /favorites 
- return that the user has previously favoritted.
- http://localhost:9090/api/v1/favorites

POST /favorite/:id 
- add a favorite movie
- http://localhost:9090/api/v1/favorites/7

GET /movies?search={search} 
- return popular movies or what the user searched for
- This should take apiKey and searchQuery as parameters and return a well structured JSON collection of
- http://localhost:9090/api/v1/movies?search=the&apikey=qwer123

GET /movies/:id 
- return that specific movie in detail
- This should take apiKey as a parameter and return full details of the requested movie in well structured JSON.
- http://localhost:9090/api/v1/movies/10?apikey=qwer123
