package com.example.DnDBrowser.business.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Speed{
    public String walk;
    public String burrow;
    public String fly;
    public String swim;
}
