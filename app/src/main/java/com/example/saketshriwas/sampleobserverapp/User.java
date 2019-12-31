package com.example.saketshriwas.sampleobserverapp;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * Created by Saket.Shriwas on 11/24/2016.
 */

public class User extends BaseObservable{
    private String userName, userAge;

    @Bindable
    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
        //notifyPropertyChanged(R.id.edtName);
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }
}
