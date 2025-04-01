package com.example.myapplication;

public class KalmanFilter {
    private double Q = 0.00001; // Process noise covariance
    private double R = 0.001;   // Measurement noise covariance
    private double X = 0, P = 1, K;

    public KalmanFilter() {
    }

    public double update(double measurement) {
        // Prediction update
        P = P + Q;

        // Measurement update
        K = P / (P + R);
        X = X + K * (measurement - X);
        P = (1 - K) * P;

        return X;
    }
}