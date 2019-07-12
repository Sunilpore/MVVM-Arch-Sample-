package com.mydesign.utils.abstract_method;


import com.mydesign.utils.Constants;
import com.mydesign.utils.abstract_method.interfaces.Rxapi;
import com.mydesign.utils.abstract_method.method_class.RxApiCall;

public class AssignFactorySubClass extends AbstractPackages {

    @Override
    public Rxapi acessApiCall(String request) {

        switch (request){
            case Constants.AbstractVarTag.NULL_STRING:
                return null;
            case Constants.AbstractVarTag.API_CALL:
                return new RxApiCall();
        }

        return null;
    }


}
