<?php
/**
 * Created by PhpStorm.
 * User: доця
 * Date: 22.12.2016
 * Time: 15:00
 */

 namespace app;
use app\paymentSystem\PaymentSystemInterface;

class paymontService
{
public function payment(PaymentSystemInterface $paymentSystem)
{
    $paymentSystem->paymont();

}
}