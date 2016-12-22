package com.fileuploader;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping("/files")
public class FileUploaderController {

	@RequestMapping(value = "/selectFile", method = RequestMethod.GET)
	public String selectFile()
	{
		return "selectFile";
	}
	
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("file") CommonsMultipartFile fileUpload, ModelMap model)
	{
		System.out.println(fileUpload.getOriginalFilename());
		
		model.addAttribute("fileName", fileUpload.getOriginalFilename());
		model.addAttribute("fileSize", fileUpload.getSize());
		model.addAttribute("fileContentType", fileUpload.getContentType());
		return "uploadSuccessful";
	}
}
