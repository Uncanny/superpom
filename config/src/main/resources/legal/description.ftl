<#-- To render the description of a license file header.
 Available context :
 - project the maven project
 - addSvnKeyWords
 - organizationName
 - projectName
 - inceptionYear
 - file current file to treat
-->
FILE: ${file.absolutePath?replace(project.basedir,"")?replace("\\","/")?substring(1)}
<#setting locale="en_US">
<#assign millis=file.lastModified()>
DATE: ${millis?number_to_datetime?string("EEEE, MMMM dd, yyyy, hh:mm:ss a '('zzz')'")}

This file is part of the ${projectName} Project:
  ${project.url}

${organizationName}
  ${project.organization.url}