$(document).ready(function(){
     
     $('.open-menu-btn').on('click', function(){
	  	if($('body').hasClass('closed-menu')){
	   	   $('body').removeClass('closed-menu');
	   	   $('.queries ul').css("display", "block");
	   	   $('.queries').css("border-color", "#23a2b7");
	   	   $('#idCompName').css("visibility", "visible");
	   	   
	   	   $('#burger2').css("display", "none");
	   	   $('#burger1').css({"transform":"rotate(45deg)", "margin-top":"13px"});
	   	   $('#burger3').css({"transform":"rotate(-45deg)", "margin-top":"-7px"});
	   	   
	  	}else {
		   $('body').addClass('closed-menu');
		   $('.queries ul').css("display", "none");
		   $('.queries').css("border-color", "#23a2b700");
		   $('#idCompName').css("visibility", "hidden");
		   
		   $('#burger2').css("display", "block");
	   	   $('#burger1').css({"transform":"rotate(0deg)", "margin-top":"0px"});
	   	   $('#burger3').css({"transform":"rotate(0deg)", "margin-top":"0px"});
		   
		}
     });


$("#idSelectAll").click(function () {
            $(".checkBoxClass").attr('checked', this.checked);
        });

});