package com.test.inventory.repository;

import com.test.inventory.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// Using the @Repository annotation is not necessary because JpaRepository is already annotated with @Repository.
// the JpaRepository is transactional meaning that it will automatically commit or rollback the transaction.
// This interface extends JpaRepository which provides CRUD operations on the Employee entity.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
