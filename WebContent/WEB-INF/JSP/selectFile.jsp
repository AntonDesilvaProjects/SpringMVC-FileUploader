<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Upload File</title>
</head>
<body>
	<h1>Upload Your File Here</h1>
	
	<form action="/FileUploader/files/uploadFile" method="POST" enctype="multipart/form-data">
		<table>
			<tr>
				<td>Select a file to upload : <input type="file" name="file"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Upload"/></td>
			</tr>
		</table>
	</form>
</body>
</html>