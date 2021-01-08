# Computer-MVC-Demo

This application will run at `localhost:8080/home` and has the following url's:
- `localhost:8080/computers` 
- `localhost:8080/computers/mac`
- `localhost:8080/computers/dell`

Path variables can be set to any POJO attribute...often times you will see them set to an `id` like what we did in the workshop or as in this case, set to the `name` attribute. To avoid ambiguous mapping, the `id` controller method has been commented out in this demo example. 

The `Computer` model views are accessed via the plural `allComputersModel` declared on line 22 of the `ComputerController` and `singleComputerModel` declared on line 34.