package com.test.inventory.mapper;

import com.test.inventory.dto.EmployeeDto;
import com.test.inventory.entity.Employee;
// This class is used to map an Employee entity to an EmployeeDto and vice versa.
public class EmployeeMapper {
    // This method maps an Employee entity to an EmployeeDto. Why? Because we need to convert the data from the server to the client.
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setEmail(employee.getEmail());
        return employeeDto;
    }
    // This method maps an EmployeeDto to an Employee entity. Why? Because we need to convert the data from the client to the server.
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        return employee;
    }
}
