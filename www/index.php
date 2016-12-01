<?php
//phpinfo();
//побороть ошибку git
//git config --global user.email "ge*****gmail.com"

//git config --global user.name "Fedor Emelianenko"
class Room
{
    public $color='green';
    public function getColor()
    {
        echo $this->color;
    }
    public function changeColor($color){
        $this->color=$color;
    }
}
$ob= new Room();
$ob->color='red';

$ob->changeColor('blue');
$ob->getColor();


