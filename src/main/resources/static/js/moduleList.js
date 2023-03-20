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


/*$("#idSelectAll").click(function () {
            $(".checkBoxClass").attr('checked', this.checked);
        });
$("#idSelectAll").click(function () {
    $(".checkBoxClass").prop('checked', $(this).prop('checked'));
});
$(".checkBoxClass").click(function () {
    $("#idSelectAll").prop('checked', false);
});*/

    $('#idSelectAll').on('click',function(){
        if(this.checked){
            $('.checkBoxClass').each(function(){
                this.checked = true;
            });
        }else{
             $('.checkBoxClass').each(function(){
                this.checked = false;
            });
        }
    });
    
    $('.checkBoxClass').on('click',function(){
        if($('.checkBoxClass:checked').length == $('.checkBoxClass').length){
            $('#idSelectAll').prop('checked',true);
        }else{
            $('#idSelectAll').prop('checked',false);
        }
    });
});

$(function(){
   // Show hide functionality of ROWS...

   // Step 1: On checkbox check -> add 'listed' class to row and it's sub rows
       $('.checkBoxClass').on('click',function(){
           $tr=$(this).closest('tr');
           rowspan=$(this).attr('rowspan');
           console.log("ROW Span : " + rowspan);
           index=$('tr').index($tr);
           tot=parseInt(index)+parseInt(rowspan);
           for(var i=index,len=tot;i<len;i++){
                if($('tr:eq('+i+')').hasClass("listed")){
                    $('tr:eq('+i+')').removeClass("listed");
                }else{
                    $('tr:eq('+i+')').addClass("listed");
                }
           }
       });

    // Step 2: On button 'Next' click, hide all rows that doesn't contains 'listed' class.
        $('#idNext').on('click', function(e){

            $("#idAssumption tr").each(function () {
                if (!($(this).hasClass("listed") || $(this).hasClass("hero"))) {
                    $(this).addClass("remove");
                }
            });

            $("#idSelectAll").attr("disabled", true);
            $('#idBtnBack').css("visibility", "visible");
            e.preventDefault();
        });

    // Step 3: Revert i.e. show all hidden rows.
        $('#idBtnBack').on('click', function(e){

            $('#idAssumption').find('.remove').each(function(){
                $(this).removeClass("remove");
            });

            $("#idSelectAll").attr("disabled", false);
            $('#idBtnBack').css("visibility", "hidden");
            e.preventDefault();
        });



});