package com.fpelizza.todoapp.mapper;

public interface IMapper <Input,Output> {

    public Output map(Input In);

}
