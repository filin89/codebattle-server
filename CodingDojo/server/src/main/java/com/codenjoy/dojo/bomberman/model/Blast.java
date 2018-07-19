package com.codenjoy.dojo.bomberman.model;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2016 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import static com.codenjoy.dojo.bomberman.model.Elements.BOOM;

import com.codenjoy.dojo.services.PointImpl;
import com.codenjoy.dojo.services.State;

/**
 * User: sanja
 * Date: 20.04.13
 * Time: 15:46
 */
public class Blast extends PointImpl implements State<Elements, Player> {

    private Hero bomberman;

    public Blast(int x, int y, Hero bomberman) {
        super(x, y);
        this.bomberman = bomberman;
    }

    public boolean itsMine(Hero bomberman) {
        return this.bomberman == bomberman;
    }

    @Override
    public Elements state(Player player, Object... alsoAtPoint) {
        return BOOM;
    }
}