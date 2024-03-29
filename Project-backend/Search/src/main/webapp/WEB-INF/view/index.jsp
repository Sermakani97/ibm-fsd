<!doctype html>  
<html lang="en">  
<head>  
  <meta charset="utf-8">  
  <title>jQuery UI Autocomplete - Default functionality</title>  
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">  
  <script src="https://code.jquery.com/jquery-1.10.2.js"></script>  
  <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>  
  <link rel="stylesheet" href="/resources/demos/style.css">  
  <script>  
  $(function() {  
    $( "#productName" ).autocomplete({  
      source:'${pageContext.request.contextPath }/product/search'  
    });  
  });  
  </script>  
</head>  
<body>  
<div class="ui-widget">  
  <label for="productName">Search Product </label>  
  <input id="productName">  
</div>  
</body>  
</html>  