# Computer-MVC-Demo-JPA-enabled

This application will run at `localhost:8080/home` and has the following url's:
- `localhost:8080/computers` 
- `localhost:8080/computers/mac`
- `localhost:8080/computers/dell`
- `localhost:8080/computers-by-id/1`
- `localhost:8080/computers-by-id/2`

And the `h2` console at `localhost:8080/h2-console`


Path variables can be set to any POJO attribute...often times you will see them set to an `id` like what we did in the workshop or as in this case, set to the `name` attribute. To avoid ambiguous mapping, the `id` controller method has been commented out in this demo example. 

An h2 database has been setup to read data from the `Populator`...see the `application.properties` file in `src/main/resources` for more info. You can access the `h2-console` at `localhost:8080/h2-console`