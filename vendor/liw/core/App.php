<?php
namespace liw\core;
/**
 * Class App
 */
abstract class App
{
    public function __construct()
    {
        echo 'Создался новый экземпляр класса из папки "vendor/liw/core/"<br>';
    }
    abstract public function run();
    final public function getFramework()
    {
        return 'LIW<br>';
    }
}