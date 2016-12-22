<?php
/**
 * Created by PhpStorm.
 * User: доця
 * Date: 22.12.2016
 * Time: 16:52
 */

namespace app\paymentSystem;


class webmoney implements PaymentSystemInterface
{
    public function paymont()
    {
        echo "Система Webmoney выполнила платеж!!";
    }
}