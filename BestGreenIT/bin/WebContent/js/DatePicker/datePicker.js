$(function() {
        $( "#datepickerBegin" ).datepicker();
        $( "#datepickerEnd" ).datepicker();
        $( "#anim" ).change(function() {
            $( "#datepicker" ).datepicker( "option", "showAnim", $( this ).val() );
        });
    });