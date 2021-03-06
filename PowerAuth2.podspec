Pod::Spec.new do |s|
	# General information
	s.name              = 'PowerAuth2'
	s.version           = '0.19.0'
	s.summary           = 'PowerAuth Mobile SDK for iOS'
	s.homepage          = 'https://github.com/lime-company/powerauth-mobile-sdk'
	s.social_media_url  = 'https://twitter.com/lime_company'
	s.documentation_url = 'https://github.com/lime-company/powerauth-mobile-sdk/wiki/PowerAuth-SDK-for-iOS'
	s.author            = { 
	  'Lime - HighTech Solution s.r.o.' => 'support@lime-company.eu'
	}
	s.license = { 
		:type => 'Apache License, Version 2.0', 
		:file => 'LICENSE' 
	}
		
	# Source files
	s.source = { 
		:git => 'https://github.com/lime-company/powerauth-mobile-sdk.git',
		:tag => "#{s.version}",
		:submodules => true
	}
	
	# FAT framework build
	s.platform        = :ios, '8.0'
	s.prepare_command = <<-CMD
		./scripts/ios-build-libraries.sh release --out-dir Library
	CMD
	
	# Produced files
	s.source_files          = 'Library/**/*.{h,m}'
	s.private_header_files  = 'Library/Private/*.h'
	s.vendored_libraries    = 'Library/libPowerAuthCore.a'
	s.requires_arc          = true
	s.libraries             = 'c++'
	# Tweaks
	s.pod_target_xcconfig   = { 'CLANG_WARN_OBJC_IMPLICIT_RETAIN_SELF' => 'NO' }
	
end
