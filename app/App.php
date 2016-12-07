<?php
namespace app;
use liw\core\App as Application;
/**
 * Class App
 * @package app
 */
final class App extends Application
{

//    public function __construct()
//    { parent:: __construct();
//        echo 'Создался новый экземпляр класса из папкм "app/"<br> ';
//    }

    public function run($data = null)
    {
        echo $data->get ();
        //echo 'Этот метод является реализацией абстрактного класса<br>';
    }

}

