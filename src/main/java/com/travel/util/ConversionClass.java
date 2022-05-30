package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.entity.Admin;
import com.travel.entity.Booking;
import com.travel.entity.Customer;
import com.travel.entity.Driver;
import com.travel.entity.Route;
import com.travel.entity.User;
import com.travel.entity.Vehicle;
import com.travel.model.AdminDTO;
import com.travel.model.BookingDTO;
import com.travel.model.CustomerDTO;
import com.travel.model.DriverDTO;
import com.travel.model.RouteDTO;
import com.travel.model.UserDTO;
import com.travel.model.VehicleDTO;

@Component
public class ConversionClass {
	
	public  User convertToUserEntity(UserDTO userDto)
	{
		User user=new User();
		BeanUtils.copyProperties(userDto, user);
		return user;
		
	}
	public  UserDTO convertToUserDTO(User user)
	{
		UserDTO userDto=new UserDTO();
		BeanUtils.copyProperties( user,userDto);
		return userDto;
		
	}
	public  Admin convertToAdminEntity(AdminDTO adminDto)
	{
		Admin admin =new Admin();
		BeanUtils.copyProperties(adminDto, admin);
		return admin;
		
	}
	public  AdminDTO convertToAdminDTO(User admin)
	{
		AdminDTO adminDto=new AdminDTO();
		BeanUtils.copyProperties( admin,adminDto);
		return adminDto;
		
	}
	
	public  Route convertToRouteEntity(RouteDTO routeDto) {
		Route route=new Route();
		BeanUtils.copyProperties(routeDto, route);
		return route;
		
	}
	
	public  RouteDTO convertToRouteDTO(Route route) {
		RouteDTO routeDto=new RouteDTO();
		BeanUtils.copyProperties(route,routeDto);
		return routeDto;
		
	}
	
	public  Booking convertToBookingEntity(BookingDTO bookingDto) {
		Booking booking =new Booking();
		BeanUtils.copyProperties(bookingDto, booking);
		return booking;
		
	}
	
	public  BookingDTO convertToBookingDTO(Booking booking) {
		BookingDTO bookingDto=new BookingDTO();
		BeanUtils.copyProperties(booking , bookingDto);
		return bookingDto;
		
	}
	
	public  Customer convertToCustomerEntity(CustomerDTO customerDto) {
		Customer customer=new Customer();
		BeanUtils.copyProperties(customerDto,customer);
		return customer;
		
	}
	
	public  CustomerDTO convertToCustomerDTO(Customer customer) {
		CustomerDTO customerDto=new CustomerDTO();
		BeanUtils.copyProperties(customer,customerDto);
		return customerDto;
		
	}
	
	
	public  Driver convertToDriverEntity(DriverDTO driverDto) {
		Driver driver=new Driver();
		BeanUtils.copyProperties(driverDto,driver);
		return driver;
		
	}
	
	public  DriverDTO convertToDriverDTO(Driver driver) {
		DriverDTO driverDto=new DriverDTO();
		BeanUtils.copyProperties(driver,driverDto);
		return driverDto;
		
	}
	
	public  Vehicle convertToVehicleEntity(VehicleDTO vehicleDto) {
		Vehicle vehicle=new Vehicle();
		BeanUtils.copyProperties(vehicleDto,vehicle);
		return vehicle;
		
	}
	
	public  VehicleDTO convertToVehicleDTO(Vehicle vehicle) {
		VehicleDTO vehicleDto=new VehicleDTO();
		BeanUtils.copyProperties(vehicle,vehicleDto);
		return vehicleDto;
		
	}
	
}
