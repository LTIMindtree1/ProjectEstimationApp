$(document).ready(function(){
     $('.open-menu-btn').on('click', function(){
	  	if($('body').hasClass('closed-menu')){
	   	   $('body').removeClass('closed-menu');
	   	   $('.queries ul').css("display", "block");
	   	   $('.queries').css("border-color", "#23a2b7");
	   	   $('#idCompName').css("visibility", "visible");
	   	   //$('.contentH').css("width", "95%");
	   	   
	   	   $('#burger2').css("display", "none");
	   	   $('#burger1').css({"transform":"rotate(45deg)", "margin-top":"13px"});
	   	   $('#burger3').css({"transform":"rotate(-45deg)", "margin-top":"-7px"});
	   	   
	  	}else {
		   $('body').addClass('closed-menu');
		   $('.queries ul').css("display", "none");
		   $('.queries').css("border-color", "#23a2b700");
		   $('#idCompName').css("visibility", "hidden");
		   //$('.contentH').css("width", "94.25%");
		   
		   $('#burger2').css("display", "block");
	   	   $('#burger1').css({"transform":"rotate(0deg)", "margin-top":"0px"});
	   	   $('#burger3').css({"transform":"rotate(0deg)", "margin-top":"0px"});
		   
		}
     });
      $("#idForm").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

    
});

//fu


function fire_ajax_submit() {

   var name=$("#idName").val();
   var  region=$("#idRegion").val();
   var bsgContact=$("#idBsgcontact").val();
   var pdmContact =$("#idPdmContact").val();
   var tFocus=$("#idTFocus").val();
   var cemTeam=$("#idCemTeam").val();
   var data={name:name,
            region:region,
            bsgContact:bsgContact,
            pdmContact:pdmContact,
            tFocus:tFocus,
            cemTeam:cemTeam
            };

    $.ajax({
        type: "GET",
        contentType: 'application/xml',
        url: "details",
        data: JSON.stringify(data),
        dataType: 'json',
       // cache: false,
        timeout: 600000,
        success: function (data) {
        alert("Success1"+data);
//window.location = '/details';
alert("Success2");
        },
        error: function (e) {

            alert("UNSuccess2"+data);

        }
    });

}