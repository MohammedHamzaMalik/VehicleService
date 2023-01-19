package com.vehicleService

import java.util.*

class Customer(val customerId: Int, val name: String, val contactInfo: String)

class Vehicle(val vehicleId: Int, val customerId: Int, val make: String, val model: String, val year: Int)

class Employee(val employeeId: Int, val name: String, val contactInfo: String)

class JobCard(val jobCardId: Int, val vehicleId: Int, val employeeId: Int, val dateCreated: String, val servicePerformed: String, var serviceCount: Int, var status: String = "open")

class ServiceHistory(val vehicleId: Int, val jobCardId: Int, val servicePerformed: String, val serviceDate: String)
