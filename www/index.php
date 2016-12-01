<?php
//phpinfo();
//побороть ошибку git
//git config --global user.email "ge*****gmail.com"

//git config --global user.name "Fedor Emelianenko"
class Room
{
    public $color='green<br>';
    public function getColor()
    {
        echo $this->color;
    }
    public function changeColor($color){
        $this->color=$color;
    }
}

$ob= new Room();
echo $ob->color;
//$ob->changeColor('blue');
$ob->getColor();
class Room2
{
    static $color='red Blue<br>';
    public static function getColor2()
    {
        echo static::$color;
    }
}
Room2::getColor2();
echo Room2::$color;
$ob2 = new Room2;
echo $ob2::$color;
$ob2::getColor2();

class Banya {
    public function __construct()
    {
        echo "VSE BUDE OK<br>";
    }
    public function __invoke()
    {
        // TODO: Implement __invoke() method.
        echo "Мы обратились к обьекту как к ф-ии<br>";

    }
    public function __toString()
    {
        echo 'Мы обратились к обьекту как к строке<br>';

    }
}

$obj= new Banya;
$obj();
//echo $obj;