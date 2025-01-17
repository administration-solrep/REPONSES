package fr.dila.st.ui.contentview;

import java.util.ArrayList;
import java.util.List;
import org.nuxeo.ecm.core.api.SortInfo;

public class CorePageProviderUtil {

    public static SortInfo[] getSortinfoForQuery(List<SortInfo> sortInfos) {
        return getSortinfoForQuery(sortInfos, null);
    }

    public static SortInfo[] getSortinfoForQuery(List<SortInfo> sortInfos, String additionalSort) {
        List<SortInfo> listSortInfos = new ArrayList<>();
        if (sortInfos != null) {
            for (SortInfo sortInfo : sortInfos) {
                if (sortInfo.getSortColumn().contains(", ")) {
                    for (String column : sortInfo.getSortColumn().split(", ")) {
                        String col = column;
                        Boolean asc = sortInfo.getSortAscending();
                        if (column != null && column.contains("#INVERT#")) {
                            // inversion des asc et desc
                            col = col.replace("#INVERT#", "").trim();
                            asc = !asc;
                        }
                        SortInfo s = new SortInfo(col, asc);
                        // éviter les doublons de colonne
                        if (listSortInfos.isEmpty()) {
                            listSortInfos.add(s);
                        } else {
                            List<SortInfo> currentListSortInfos = new ArrayList<>();
                            currentListSortInfos.addAll(listSortInfos);
                            for (SortInfo sortInfoAdded : currentListSortInfos) {
                                if (!sortInfoAdded.getSortColumn().equals(s.getSortColumn())) {
                                    listSortInfos.add(s);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    listSortInfos.add(sortInfo);
                }
            }
        }
        if (additionalSort != null) {
            String[] sorts = additionalSort.split(",");

            if (sorts != null) {
                for (String sort : sorts) {
                    String[] columnAndOrder = sort.split(" ");
                    if (columnAndOrder.length >= 2) {
                        SortInfo sortInfo = new SortInfo(
                            columnAndOrder[0],
                            "asc".equalsIgnoreCase(columnAndOrder[1].trim())
                        );
                        listSortInfos.add(sortInfo);
                    } else {
                        throw new IllegalStateException(
                            String.format("additionalSort cannot be parsed: %s", additionalSort)
                        );
                    }
                }
            } else {
                throw new IllegalStateException(String.format("additionalSort cannot be parsed: %s", additionalSort));
            }
        }
        return listSortInfos.toArray(new SortInfo[] {});
    }
}
