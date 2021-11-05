package com.Spring.org.service;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.org.Dao.EmployeeDao;
import com.Spring.org.model.Employee;

@Service
public  class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeDao employeeDao;

public EmployeeDao getEmployeeDao() {
return employeeDao;
}
public void setEmployeeDao(EmployeeDao employeeDao) {
this.employeeDao = employeeDao;
}

public void createEmployee(Employee employee) {
getEmployeeDao().createEmployee(employee);
}

public Employee getEmployeeById(Integer employeeId) {
return getEmployeeDao().fetchEmployeeById(employeeId);
}
public List<Employee> getAllEmployees() {
return getEmployeeDao().fetchAllEmployees();
}
public void updateEmployeeEmailById(String newEmail, Integer employeeId) {
getEmployeeDao().updateEmployeeEmailById(newEmail, employeeId);
}
public void deleteEmployeeById(Integer employeeId) {
getEmployeeDao().deleteEmployeeById(employeeId);

}
@Override
public Employee fetchEmployeeById(Integer employeeId) {
	// TODO Auto-generated method stub
	return null;
}
}
