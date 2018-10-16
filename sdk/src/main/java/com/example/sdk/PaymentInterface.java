package com.example.sdk;

public interface PaymentInterface {

    void onSuccessTransaction(String message);
    void OnFailureTransaction(String message);
}
