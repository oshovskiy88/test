<?php
namespace app;




use app\train\bye;
use app\train\privet;

final class App2
{

    use privet, bye {
        privet::boot insteadof bye;
    }


    public function __construct()
    {
        echo 'Этот метод является реализацией абстрактного класса<br>';
        $this->helloword();
        echo "<br>";
        $this->Goodbye();
        echo "<br>";
        $this->boot();
    }

    public function helloword()
    {
        echo "Hello word in class";
    }
}


