package com.salvadorjhai.widgets;

import android.view.View;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.Author;
import anywheresoftware.b4a.BA.Events;
import anywheresoftware.b4a.BA.ShortName;
import anywheresoftware.b4a.BA.Version;

/**
 * PopupWindow wrapper
 */
@Author("salvadorjhai")
@Version(1.0f)
@Events(values={"onDismiss()"})
@ShortName("JSPopupWindow")
public class JSPopupWindow extends AbsObjectWrapper<PopupWindow> {
	
	/**
	 * Create a new popup window which can display the contentView. The dimension of the window must be passed to this constructor.
	 * The popup does not provide any background. This should be handled by the content view.
	 *
	 * @param ba the ba
	 * @param eventName the event name
	 * @param contentView - View: the popup's content
	 * @param width - int: the popup's width
	 * @param height - int: the popup's height
	 */
	public void Initialize(final BA ba, final String eventName, View contentView, int width, int height) {			
		
		this.setObject(new PopupWindow(contentView, width, height, false));
		
		// Set event Listeners
		if (eventName.length() != 0) {
			this.getObjectOrNull().setOnDismissListener(new OnDismissListener() {				
				@Override
				public void onDismiss() {
					String event = eventName + "_onDismiss";
					ba.raiseEventFromUI(this, event.toLowerCase(BA.cul), null);
				}
			});
		}
	}
	
	/**
	 * Gets the content view.
	 *
	 * @return the content view
	 */
	public View getContentView() {
		return this.getObjectOrNull().getContentView();
	}
	
	/**
	 * Checks if is focusable.
	 *
	 * @return true, if is focusable
	 */
	public boolean isFocusable() {
		return this.getObjectOrNull().isFocusable();
	}
	
	/**
	 * Checks if is touchable.
	 *
	 * @return true, if is touchable
	 */
	public boolean isTouchable() {
		return this.getObjectOrNull().isTouchable();
	}
	
	/**
	 * Sets the touchable.
	 *
	 * @param touchable the new touchable
	 */
	public void setTouchable(boolean touchable) {
		this.getObjectOrNull().setTouchable(touchable);
	}

	/**
	 * Checks if is outside touchable.
	 *
	 * @return true, if is outside touchable
	 */
	public boolean isOutsideTouchable() {
		return this.getObjectOrNull().isOutsideTouchable();
	}
	
	/**
	 * Sets the outside touchable.
	 *
	 * @param touchable the new outside touchable
	 */
	public void setOutsideTouchable(boolean touchable) {
		this.getObjectOrNull().setOutsideTouchable(touchable);
	}
	
	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight() {
		return this.getObjectOrNull().getHeight();
	}
	
	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	public void setHeight(int height) {
		this.getObjectOrNull().setHeight(height);
	}
	
	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth() {
		return this.getObjectOrNull().getWidth();
	}
	
	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public void setWidth(int width) {
		this.getObjectOrNull().setWidth(width);
	}
	
	/**
	 * Checks if is showing.
	 *
	 * @return true, if is showing
	 */
	public boolean isShowing() {
		return this.getObjectOrNull().isShowing();
	}
	
	/**
	 * Show at location.
	 *
	 * @param parent the parent
	 * @param gravity the gravity
	 * @param x the x
	 * @param y the y
	 */
	public void showAtLocation(View parent, int gravity, int x, int y) {
		this.getObjectOrNull().showAtLocation(parent, gravity, x, y);
	}
	
	/**
	 * Show as drop down.
	 *
	 * @param anchor the anchor
	 */
	public void showAsDropDown(View anchor) {
		this.getObjectOrNull().showAsDropDown(anchor);
	}
	
	/**
	 * Show as drop down.
	 *
	 * @param anchor the anchor
	 * @param xoff the xoff
	 * @param yoff the yoff
	 */
	public void showAsDropDown2(View anchor, int xoff, int yoff) {
		this.getObjectOrNull().showAsDropDown(anchor, xoff, yoff);
	}
	
	/**
	 * Checks if is above anchor.
	 *
	 * @return true, if is above anchor
	 */
	public boolean isAboveAnchor() {
		return this.getObjectOrNull().isAboveAnchor();
	}
	
	/**
	 * Dismiss.
	 */
	public void dismiss() {
		this.getObjectOrNull().dismiss();
	}
	
	
	
//	/**
//	 * Disposes of the popup window. 
//	 */
//	public void dismiss() {
//		this.getObjectOrNull().dismiss();
//	}
//	
//	
//	/**
//	 * Display the content view in a popup window anchored to the bottom-left corner of the anchor view. If there is not enough room on screen to show the popup in its entirety, this method tries to find a parent scroll view to scroll. If no parent scroll view can be scrolled, the bottom-left corner of the popup is pinned at the top left corner of the anchor view.
//	 * @param anchor - View: the view on which to pin the popup window
//	 */
//	public void ShowAsDropDown1(View anchor) {		
//		this.getObjectOrNull().showAsDropDown(anchor);
//	}
//	
//	/**
//	 * Display the content view in a popup window anchored to the bottom-left corner of the anchor view offset by the specified x and y coordinates. If there is not enough room on screen to show the popup in its entirety, this method tries to find a parent scroll view to scroll. If no parent scroll view can be scrolled, the bottom-left corner of the popup is pinned at the top left corner of the anchor view. 
//	 * @param anchor - View: the view on which to pin the popup window
//	 * @param xoff - int: A horizontal offset from the anchor in pixels
//	 * @param yoff - int: A vertical offset from the anchor in pixels
//	 */
//	public void ShowAsDropDown2(View anchor, int xoff, int yoff) {
//		this.getObjectOrNull().showAsDropDown(anchor, xoff, yoff);
//	}
//	
//	/**
//	 * Display the content view in a popup window at the specified location.
//	 * @param parent - View: a parent view to get the getWindowToken() token from
//	 * @param gravity - int: the gravity which controls the placement of the popup window (Gravity.LEFT | Gravity.TOP)
//	 * @param x - int: the popup's x location offset
//	 * @param y - int: the popup's y location offset 
//	 */
//	public void ShowAtLocation(View parent, int gravity, int x, int y) {
//		this.getObjectOrNull().showAtLocation(parent, gravity, x, y);
//	}
//	
//	/**
//	 * Returns the maximum height that is available for the popup to be completely shown. 
//	 * @param anchor - View: The view on which the popup window must be anchored.
//	 * @return int: The maximum available height for the popup to be completely shown. 
//	 */
//	public int GetMaxAvailableHeight1(View anchor) {
//		return this.getObjectOrNull().getMaxAvailableHeight(anchor);
//	}
//	
//	/**
//	 * Returns the maximum height that is available for the popup to be completely shown. 
//	 * @param anchor - View: The view on which the popup window must be anchored.
//	 * @param yOffset - int: y offset from the view's bottom edge
//	 * @return int: The maximum available height for the popup to be completely shown. 
//	 */
//	public int GetMaxAvailableHeight2(View anchor, int yOffset) {
//		return this.getObjectOrNull().getMaxAvailableHeight(anchor, yOffset);
//	}
//	
//	/**
//	 * Returns the popup's requested height.
//	 * @return int: the popup height in pixels or a layout constant
//	 */
//	public int GetHeight() {
//		return this.getObjectOrNull().getHeight();
//	}
//	
//	/**
//	 * Returns the popup's requested width. 
//	 * @return int: the popup width in pixels or a layout constant
//	 */
//	public int GetWidth() {
//		return this.getObjectOrNull().getWidth();
//	}
//	
//	/**
//	 * Indicate whether this popup window is showing on screen.
//	 * @return boolean: true if the popup is showing, false otherwise 
//	 */
//	public boolean IsShowing() {
//		return this.getObjectOrNull().isShowing();		
//	}
//	
//	/**
//	 * Changes the focusability of the popup window. When focusable, the window will grab the focus from the current focused widget if the popup contains a focusable android.view.View. By default a popup window is not focusable.
//	 * @param focusable
//	 * @return
//	 */
//	public JSPopupWindow setFocusable(boolean focusable) {
//		this.getObjectOrNull().setFocusable(focusable);
//		return this;
//	}
	
}
