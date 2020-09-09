package com.sujata.resource;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("employees")
public class EmployeeResource {


//    @Path("/{id}")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Employee searchEmployees(@PathParam("id") int eid){
//        EmployeeService employeeService=new EmployeeServiceImpl();
//        return employeeService.getEmployeeById(eid);
//    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response searchEmployees(@PathParam("id") int eid){
        EmployeeService employeeService=new EmployeeServiceImpl();
        Employee employee=employeeService.getEmployeeById(eid);
        Response response=null;
        if(employee!=null)
            response=Response.ok().entity(employee).build();
        else
            response=Response.noContent().build();
        return response;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAllEmployees(){
        EmployeeService employeeService=new EmployeeServiceImpl();
        return employeeService.getAllEmployees();
    }

//    @POST
//    @Produces(MediaType.TEXT_PLAIN)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public String addEmployee(Employee employee){
//        EmployeeService employeeService=new EmployeeServiceImpl();
//        if(employeeService.addEmployee(employee))
//            return "Employee added!";
//        else
//            return "Employee not added";
//    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addEmployee(Employee employee){
        EmployeeService employeeService=new EmployeeServiceImpl();
        if(employeeService.addEmployee(employee))
            return Response.status(Response.Status.CREATED).entity("Employee added!").build();
        else
            return Response.status(Response.Status.NOT_ACCEPTABLE).entity("Employee Not added").build();
    }

    @Path("/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Employee deleteEmployee(@PathParam("id") int id){
        EmployeeService employeeService=new EmployeeServiceImpl();
        return employeeService.deleteEmployee(id);
    }

    @Path("/{id}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Employee updateEmployee(@PathParam("id") int id,Employee employee){
        EmployeeService employeeService=new EmployeeServiceImpl();
        return employeeService.updateRecord(id,employee);
    }

}
