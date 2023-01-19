package com.vehicleService

interface Command {
    fun execute()
    fun undo()
}

class CreateCustomerCommand(val customer: Customer, val customerService: CustomerService) : Command {
    override fun execute() {
        customerService.createCustomer(customer)
    }

    override fun undo() {
        customerService.deleteCustomer(customer.customerId)
    }
}

class UpdateCustomerCommand(val customer: Customer, val customerService: CustomerService) : Command {
    override fun execute() {
        customerService.updateCustomer(customer)
    }

    override fun undo() {
        customerService.undoUpdateCustomer(customer)
    }
}

class DeleteCustomerCommand(val customerId: Int, val customerService: CustomerService) : Command {
    override fun execute() {
        customerService.deleteCustomer(customerId)
    }

    override fun undo() {
        customerService.undoDeleteCustomer(customerId)
    }
}
