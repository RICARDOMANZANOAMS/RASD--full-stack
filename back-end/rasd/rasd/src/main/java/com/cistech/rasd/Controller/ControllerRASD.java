package com.cistech.rasd.Controller;

import com.cistech.rasd.DAO.DAOParameters;
import com.cistech.rasd.Entity.ParameterRASD;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ControllerRASD {

    private DAOParameters daoParameters;
    public ControllerRASD(DAOParameters theParametersDAO){
        daoParameters=theParametersDAO;
    }

    @PostMapping("/")
    public String createParametersRASD (@RequestBody ParameterRASD theParametersRASD){
        //ParametersRASD myObj=new ParametersRASD(1,"Paul",2);
        daoParameters.createParameters(theParametersRASD);
        return "It is done";
    }
}
