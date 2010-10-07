package org.odlabs.wiquery.core.commons;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.wicket.markup.html.JavascriptPackageResource;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;
import org.apache.wicket.util.io.Streams;
import org.apache.wicket.util.resource.IResourceStream;
import org.apache.wicket.util.resource.ResourceStreamNotFoundException;
import org.apache.wicket.util.resource.StringResourceStream;
import org.apache.wicket.util.template.PackagedTextTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * Makes the JavaScript template generated by wiQuery a static resource, but
 * still like any other {@link JavascriptResourceReference}.
 * </p>
 * 
 * @author Hielke Hoeve
 * @since 1.0
 */
public class WiqueryGeneratedJavaScriptResource extends
		JavascriptPackageResource {
	// Constants
	/** Constant of serialization */
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory
			.getLogger(WiqueryGeneratedJavaScriptResource.class);

	// Properties
	private CharSequence javaScriptCode;

	protected WiqueryGeneratedJavaScriptResource(Class<?> scope, String path,
			Locale locale, String style, CharSequence javaScriptCode) {
		super(scope, path, locale, style);
		this.javaScriptCode = javaScriptCode;
	}

	/**
	 * Override the packaged source link with a simple
	 * {@link StringResourceStream}.
	 */
	@Override
	protected IResourceStream getPackageResourceStream() {
		return new StringResourceStream(getWiQueryGeneratedJavaScriptCode());
	}

	/**
	 * @return an interpolated string which represents this
	 */
	private String getWiQueryGeneratedJavaScriptCode() {
		PackagedTextTemplate jstemplate = new PackagedTextTemplate(
				WiqueryGeneratedJavaScriptResourceReference.class,
				"wiquery-gen.js");

		Map<String, Object> genJs = new HashMap<String, Object>();
		genJs.put("wiqueryoutput", javaScriptCode);
		jstemplate.interpolate(genJs);

		return jstemplate.asString();
	}

	public static WiqueryGeneratedJavaScriptResource newPackageResource(
			Class<?> scope, String name, Locale locale, String style,
			CharSequence javaScriptCode) {
		return new WiqueryGeneratedJavaScriptResource(scope, name, locale,
				style, javaScriptCode);
	}

	public String getWiQueryInterpolatedJavaScriptCode() {
		InputStream is = null;
		String content = "";

		try {
			is = getResourceStream().getInputStream();
		} catch (ResourceStreamNotFoundException e) {
			log.error(e.getMessage(), e);
		}

		if (is != null) {
			try {
				content=Streams.readString(is);
			} catch (IOException e) {
				log.error(e.getMessage(), e);
			} finally {
				try {
					is.close();
				} catch (IOException e) {
					log.error(e.getMessage(), e);
				}
			}
		}

		return content;
	}
}
