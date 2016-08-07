/**
 * #-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=#
 *   This file is part of the Uncanny Super-POM project:
 *     http://uncanny.io/superpom/
 *
 *   Uncanny Software Projects
 *     http://uncanny.io/
 * #-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=#
 *   Copyright (C) 2016 Uncanny Software Projects.
 * #-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=#
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *             http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * #-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=#
 */
rawInceptionYear=project.properties.get('license.project.inceptionYear')
try {
	inceptionYear=Integer.parseInt(rawInceptionYear)
	currentYear=java.time.LocalDate.now().getYear()
	if(inceptionYear==currentYear) {
		projectDurationString="$inceptionYear"
	} else if(inceptionYear<currentYear) {
		projectDurationString="$inceptionYear-$currentYear"
	} else {
		projectDurationString="$currentYear-$inceptionYear"
	}
} catch(NumberFormatException e) {
	projectDurationString="$rawInceptionYear"
}
project.properties.setProperty('license.project.duration',projectDurationString)
println "Project duration: " + projectDurationString