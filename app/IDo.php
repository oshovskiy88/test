<?php
/**
 * Created by PhpStorm.
 * User: доця
 * Date: 06.12.2016
 * Time: 15:20
 */

namespace app;


class IDo
{
    public $nastroy="хорошее";
    public function walk($itIsRain=FALSE)
    {
        if ($itIsRain) {
            echo "Мы не идем гулять, там дождь";
        } else {
            echo "Мы идем гулять, там дождя нет";
        }
    }
}