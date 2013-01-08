	
			var $_GET = {};

			document.location.search.replace(/\??(?:([^=]+)=([^&]*)&?)/g, function () {
				function decode(s) {
					return decodeURIComponent(s.split("+").join(" "));
				}

				$_GET[decode(arguments[1])] = decode(arguments[2]);
			});
		
			$('li','ul#search_vehicul').live('click', function(){
				var idLi = $(this).attr("id");
				$('#SelectCare').html(idLi + ' <b class="caret"></b>').attr('seleted', idLi);
				location.href = "?SelectCare=" + $('#SelectCare').attr('seleted');
			});
			
			$('#Search[type="submit"]').live('click', function(){
				if($('#SelectCare').attr('seleted') != null)
				{
					location.href = "?SelectCare=" + $('#SelectCare').attr('seleted');
				}
				//alert($_GET['SelectCare']);
			});
			
			function Search()
			{
				if($_GET['SelectCare'] != null)
				{
					$('#SelectCare').html($_GET['SelectCare'] + ' <b class="caret"></b>').attr('seleted',$_GET['SelectCare']);
				}
			}
			
			$(document).ready(function() {
				Search();
			});