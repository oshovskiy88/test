<?php
/**
 * Created by PhpStorm.
 * User: доця
 * Date: 23.12.2016
 * Time: 17:05
 */

namespace app\train;


trait bye
{
    public function Goodbye()
    {
        echo "Goodbye people";
    }
    public function boot()
    {
        echo "находится в досвидании";
    }
}