<?if ($_POST['page']=="ASC") {
echo "33333"; }
else if ($_POST['page']=="DESC") { echo "4444";};


						// foreach ($res as $key=>$arItem):
						// 		$arItem[''][$key]
									
						// endforeach;




// $art=[49,50,51,52,53,54,55,56,57,58,59,60];

// 								foreach ($art as $key=>$arItem):
// 										$db_res = CPrice::GetList(
// 									        array(array("PRICE"=>"DESC")),
// 									        array(
// 									                 "PRODUCT_ID" => $arItem[$key],

// 									                // "CATALOG_GROUP_ID" => $PRICE_TYPE_ID
// 									            )
// 									    );
// 											if ($ar_res = $db_res->Fetch())
// 											{
// 											    echo $key.CurrencyFormat($ar_res["PRICE"], $ar_res["CURRENCY"]);
// 											}
// 											else
// 											{
// 											    echo "Цена не найдена!";
// 											}
// 					 			endforeach;