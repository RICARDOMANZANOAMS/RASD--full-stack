package com.cistech.rasd.DAO;

import com.cistech.rasd.Entity.ParameterRASD;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class DAOParametersImpl implements DAOParameters{
    private EntityManager theEntityManager;
    public DAOParametersImpl(EntityManager myEntityManager){
        theEntityManager=myEntityManager;
    }


    @Override
    @Transactional
    public void createParameters(ParameterRASD myParametersEntity) {
        theEntityManager.merge(myParametersEntity);

    }
}
