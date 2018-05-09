package com.trying.developing.maps;

/**
 * Created by developing on 5/9/2018.
 */

//public class CustomInfoWindowGoogleMap implements GoogleMap.InfoWindowAdapter {
//
//    private Context context;
//
//    public CustomInfoWindowGoogleMap(Context context) {
//        this.context = context;
//    }
//
//    @Override
//    public View getInfoWindow(Marker marker) {
//        return null;
//    }
//
//    @Override
//    public View getInfoContents(Marker marker) {
//
//        View view =((Context)context).getLayoutInflater()
//                .inflate(R.layout.custom_info_window, null);
//        TextView title=(TextView) view.findViewById(R.id.title);
//        TextView size=(TextView) view.findViewById(R.id.size);
//
//        title.setText(marker.getTitle());
//
//        ApartmentModel model=new ApartmentModel();
//        size.setText(model.getSize());
//
//
//
//
//        return view;
//    }
//}
