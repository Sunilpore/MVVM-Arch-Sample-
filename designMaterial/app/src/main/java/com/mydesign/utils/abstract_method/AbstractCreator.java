package com.mydesign.utils.abstract_method;


import com.mydesign.utils.Constants;

public class AbstractCreator {

    public static AbstractPackages initializeAbstract(String detector){

        switch (detector){
            case Constants.AbstractVarTag.SUB_CLASS_INITIALIZE:
                return new AssignFactorySubClass();
        }
        return null;
    }

}
