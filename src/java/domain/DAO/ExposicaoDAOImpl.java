/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import domain.models.Exposicao;

/**
 *
 * @author edson
 */
public class ExposicaoDAOImpl extends GenericDAOImpl<Exposicao> implements ExposicaoDAO{

    @Override
    public Exposicao Listar(Class clazz, String pk) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rollBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
