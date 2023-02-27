$(document).ready(function(){
     $('.open-menu-btn').on('click', function(){
	  	if($('body').hasClass('closed-menu')){
	   	   $('body').removeClass('closed-menu');
	  	}else  $('body').addClass('closed-menu');
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