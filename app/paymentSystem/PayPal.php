<?php
namespace app\paymentSystem;
class PayPal implements PaymentSystemInterface
{
    public function paymont()
    {
        echo "Система PayPal выполнила платеж!!";
    }
}
