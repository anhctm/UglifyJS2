$(document).ready(function() {
	$(window).scroll(function() {
		if ($(window).scrollTop() != 0) {
			$('#topback').fadeIn();
		} else {
			$('#topback').fadeOut();
		}
	});
	$('#topback').click(function() {
		$('html, body').animate({scrollTop:0},500);
	});
	var i = $('#bar').position().top;
	var x = $('#bar').width();	
	var w = $(window).width();	
	$(window).scroll(function() {
		if (($(window).scrollTop() > 400) && (w > 768)) {
				$('#bar').addClass('posit1');
				$('#bar').css('width', x);
		} else {
				$('#bar').removeClass('posit1');
		}
	});
	$(window).scroll(function() {
		if (($(window).scrollTop() > 0) && (w > 768)) {
				$('.wrap-tv').addClass('posit');
		} else {
				$('.wrap-tv').removeClass('posit');
		}
	});	
	$('ul.sub-menu').before('<i class="fa fa-chevron-down but" aria-hidden="true"></i>');	
	$('.but').click(function() {
		$(this).next().slideToggle("fast");;
	});		
	/* form 7 */
	var wpcf7Elm = document.querySelector( '#wpcf7-f6-p89-o2' );
	var wpcf7Elm2 = document.querySelector( '#wpcf7-f5-o3' );
	var wpcf7Elm3 = document.querySelector( '#wpcf7-f942-o1' );
	if (wpcf7Elm) {	 
		wpcf7Elm.addEventListener( 'wpcf7mailsent', function( event ) {
			openPop();
		}, false );
	}
	if (wpcf7Elm2){	
		wpcf7Elm2.addEventListener( 'wpcf7mailsent', function( event ) {
			openPop2();
		}, false );	
	}
	if (wpcf7Elm3){	
		wpcf7Elm3.addEventListener( 'wpcf7mailsent', function( event ) {
			openPop3();
		}, false );	
	}	
	function openPop()
	{ 
		var dheight = screen.height; 
		var dwidth = document.body.clientWidth; 
		$("#background").width(dwidth).height(dheight); 
		$("#background").fadeTo("fast",0.8); 
		$("body").css("overflow","hidden"); 
		var w = $(window).width();
		var $pop=$("#pop");	
		if (w <= 768) {
				var x = w - 30;
				$pop.css('width',x);
				$pop.css("left",(w-x)/2); 
				$pop.css("top", 100);			
				$pop.fadeIn("fast"); 			
		} else {	
			$pop.css("top", 200); 
			$pop.css("left",(dwidth-$pop.width())/2); 
			$pop.fadeIn("fast"); 
		}
	}	
    $(".clos").click(function() {
		$("#background").fadeOut("fast"); 
		$("#pop").fadeOut("fast"); 	
		$("body").css("overflow","auto"); 
    });		
	function openPop2()
	{ 
		var dheight = screen.height; 
		var dwidth = document.body.clientWidth; 
		$("#background").width(dwidth).height(dheight); 
		$("#background").fadeTo("fast",0.8); 
		$("body").css("overflow","hidden"); 
		var w = $(window).width();
		var $pop2=$("#pop2");	
		if (w <= 768) {
				var x = w - 30;
				$pop2.css('width',x);
				$pop2.css("left",(w-x)/2); 
				$pop2.css("top", 100);			
				$pop2.fadeIn("fast"); 			
		} else {	
			$pop2.css("top", 200); 
			$pop2.css("left",(dwidth-$pop2.width())/2); 
			$pop2.fadeIn("fast"); 
		}
	}	
    $(".clos2").click(function() {
		$("#background").fadeOut("fast"); 
		$("#pop2").fadeOut("fast"); 	
		$("body").css("overflow","auto"); 
    });	
	function openPop3()
	{ 
		var dheight = screen.height; 
		var dwidth = document.body.clientWidth; 
		$("#background").width(dwidth).height(dheight); 
		$("#background").fadeTo("fast",0.8); 
		$("body").css("overflow","hidden"); 
		var w = $(window).width();
		var $pop3=$("#pop3");	
		if (w <= 768) {
				var x = w - 30;
				$pop3.css('width',x);
				$pop3.css("left",(w-x)/2); 
				$pop3.css("top", 100);			
				$pop3.fadeIn("fast"); 			
		} else {	
			$pop3.css("top", 200); 
			$pop3.css("left",(dwidth-$pop3.width())/2); 
			$pop3.fadeIn("fast"); 
		}
	}	
    $(".clos3").click(function() {
		$("#background").fadeOut("fast"); 
		$("#pop3").fadeOut("fast"); 	
		$("body").css("overflow","auto"); 
    });		
});
// show khách hàng Change image every 2 seconds
var slideIndex = 0;
showSlides();
var z = 10000;
function showSlides() {
    var i;
    var slides = document.getElementsByClassName("slideshow");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none"; 
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1} 
    slides[slideIndex-1].style.display = "block"; 
	setTimeout(function() {slides[slideIndex-1].style.display = "none"}, 4000);
	z = z + 20;
    setTimeout(showSlides, z); // Change image every 2 seconds
}
