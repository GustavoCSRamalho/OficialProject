
$('.bCadastrar button').click(function() {
  $('.Login').addClass('hideForms');
  $('.cadastro').removeClass('hideForms');
});

$('.bLogin button').click(function() {
	$('.cadastro').addClass('hideForms');
	$('.Login').removeClass('hideForms');  
});